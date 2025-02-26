package org.project.bookstore_server.mapper;

import org.project.bookstore_server.entity.BorrowingRequest;
import org.project.bookstore_server.model.borrowingRequest.BorrowingRequestDto;
import org.project.bookstore_server.model.borrowingRequest.BorrowingRequestDtoWrapper;

public interface BorrowingRequestMapper {

    BorrowingRequestDto toDto(BorrowingRequest borrowingRequest);

    BorrowingRequest toEntity(BorrowingRequestDto borrowingRequestDto);

    BorrowingRequestDtoWrapper toWrapperDto(BorrowingRequest borrowingRequest);
}
