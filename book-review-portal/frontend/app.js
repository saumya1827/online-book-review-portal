fetch('http://localhost:8080/books')
  .then(res => res.json())
  .then(data => {
    const list = document.getElementById('book-list');
    data.forEach(book => {
      list.innerHTML += `<p><strong>${book.title}</strong>: ${book.review}</p>`;
    });
  });