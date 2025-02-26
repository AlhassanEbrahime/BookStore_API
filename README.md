# Library Management API

## Features

### Customer Features

1. **Browse Books**  
   - Explore books by categories.  
   - **Endpoint:** `GET /book/category/{category}`

2. **View Book Details**  
   - Get detailed information about a specific book.  
   - **Endpoint:** `GET /book/{id}`

3. **Request to Borrow a Book**  
   - Request to borrow a specific book.  
   - **Endpoint:** `POST /book/{id}/borrow`

4. **Check Borrowing Status**  
   - View borrowing requests for a specific customer.  
   - **Endpoint:** `GET /book/myrequests`

5. **Register**  
   - Register a new customer.  
   - **Endpoint:** `POST /auth/register`

6. **Authenticate** *(Under Development)*  
   - Authenticate as a customer.  
   - **Endpoint:** `POST /auth/authentication`

---

### Admin Features

1. **Add New Book**  
   - Add a new book to the inventory.  
   - **Endpoint:** `POST /book/add`

2. **Update Book Details**  
   - Update details of an existing book.  
   - **Endpoint:** `PUT /book/update/{id}`

3. **Manage Inventory**  
   - **Update Stock Levels**: Update stock levels of a book.  
     - **Endpoint:** `PUT /book/{id}/stock`
   - **Set Availability**: Set the availability status of a book.  
     - **Endpoint:** `PUT /book/{id}/availability`

4. **Delete Book**  
   - Delete a book from the inventory.  
   - **Endpoint:** `DELETE /book/delete/{id}`

5. **Manage Borrowing Requests**  
   - Update the status of a borrowing request.  
   - **Endpoint:** `PUT /book/borrow/{requestId}/status`

6. **Get All Borrowing Requests**  
   - View a list of all borrowing requests.  
   - **Endpoint:** `GET /book/requests`

7. **Authenticate** *(Under Development)*  
   - Authenticate as an admin.  
   - **Endpoint:** `POST /auth/authentication`

