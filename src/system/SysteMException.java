package system;

/**
 * The system exception class.
 */
public class SysteMException extends Exception
{
 /** The serialVersionUID. */
 private static final long serialVersionUID = 1L; 
 /** The error message. */
 private String message;
  
 /**
  * Instantiates a new system exception.
  *
  * @param s the error message.
  */
 public SysteMException(String s)
 {
  message = s;	
 }
 
 /**
  * Returns the error message.
  *
  * @return the error message.
  * @see java.lang.Throwable#getMessage()
  */
 public String getMessage()
 {
  return message;
 }
}
