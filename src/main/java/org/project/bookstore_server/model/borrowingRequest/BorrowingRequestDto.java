package org.project.bookstore_server.model.borrowingRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowingRequestDto {
    private Long id;
    private Long userId;
    private Long bookId;
    private String userName;
    private String bookTitle;
    private String borrowingStatus;
    private LocalDateTime borrowingDate;
    private LocalDateTime expectedReturnDate;

}
