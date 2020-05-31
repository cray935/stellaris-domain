package de.stellaris.domain.technology;

public class ReaderException extends Exception {

  private static final long serialVersionUID = 1L;

  public ReaderException(String message, Throwable cause) {
    super(message, cause);
  }

  public ReaderException(String message) {
    super(message);
  }

}
