package org.project.bookstore_server.mapper.impl;

import org.project.bookstore_server.entity.Book;
import org.project.bookstore_server.entity.BorrowingRequest;
import org.project.bookstore_server.entity.User;
import org.project.bookstore_server.entity.enums.Status;
import org.project.bookstore_server.exception.RecordNotFoundException;
import org.project.bookstore_server.mapper.BorrowingRequestMapper;
import org.project.bookstore_server.model.borrowingRequest.BorrowingRequestDto;
import org.project.bookstore_server.model.borrowingRequest.BorrowingRequestDtoWrapper;
import org.project.bookstore_server.repository.BookRepository;
import org.project.bookstore_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BorrowingRequestMapperImpl implements BorrowingRequestMapper {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BorrowingRequestDto toDto(BorrowingRequest borrowingRequest) {
        BorrowingRequestDto borrowingRequestDTO = new BorrowingRequestDto(
                borrowingRequest.getId(),
                borrowingRequest.getUser().getId(),
                borrowingRequest.getBook().getId(),
                borrowingRequest.getUser().getUserName(),
                borrowingRequest.getBook().getTitle(),
                borrowingRequest.getBorrowingStatus().name(),
                borrowingRequest.getBorrowingDate(),
                borrowingRequest.getExpectedReturnDate()
        );
        return borrowingRequestDTO;
    }

    @Override
    public BorrowingRequest toEntity(BorrowingRequestDto borrowingRequestDto) {
        BorrowingRequest borrowingRequest = new BorrowingRequest();
        borrowingRequest.setId(borrowingRequestDto.getId());
        User user = userRepository.findById(borrowingRequest.getId())
                .orElseThrow( () -> new RecordNotFoundException("The user with id" + borrowingRequestDto.getUserId() + "doesn't exists"));
        borrowingRequest.setUser(user);
        Book book = bookRepository.findById(borrowingRequestDto.getBookId())
                .orElseThrow(() -> new RecordNotFoundException("The book with id" + borrowingRequestDto.getBookId() + "doesn't exists"));
        borrowingRequest.setBook(book);
        borrowingRequest.setBorrowingStatus(Status.valueOf(borrowingRequestDto.getBorrowingStatus()));
        borrowingRequest.setBorrowingDate(borrowingRequestDto.getBorrowingDate());
        borrowingRequest.setExpectedReturnDate(borrowingRequestDto.getExpectedReturnDate());
        return borrowingRequest;
    }

    @Override
    public BorrowingRequestDtoWrapper toWrapperDto(BorrowingRequest borrowingRequest) {
        BorrowingRequestDtoWrapper borrowingRequestWrapperDTO = new BorrowingRequestDtoWrapper();
        borrowingRequestWrapperDTO.setBookTitle(borrowingRequest.getBook().getTitle());
        borrowingRequestWrapperDTO.setBorrowingStatus(String.valueOf(borrowingRequest.getBorrowingStatus()));
        borrowingRequestWrapperDTO.setBorrowingDate(borrowingRequest.getBorrowingDate());
        borrowingRequestWrapperDTO.setExpectedReturnDate(borrowingRequest.getExpectedReturnDate());
        return borrowingRequestWrapperDTO;
    }

}
