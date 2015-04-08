package org.nypl.simplified.books.core;

import com.io7m.jfunctional.OptionType;

public interface BooksStatusCacheType
{
  OptionType<BookSnapshot> booksSnapshotGet(
    BookID id);

  void booksSnapshotUpdate(
    BookID id,
    BookSnapshot snap);

  void booksStatusClearAll();

  OptionType<BookStatusType> booksStatusGet(
    BookID id);

  void booksStatusUpdate(
    BookID id,
    BookStatusLoanedType s);

  void booksStatusUpdateLoaned(
    BookID id);

  void booksStatusUpdateRequesting(
    BookID id);
}
