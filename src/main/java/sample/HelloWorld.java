package sample;

import org.joda.time.LocalTime;

public final class HelloWorld {
  private HelloWorld(){

  }

  /**
   * Provides an entry point for the application.
   * @param args command line parameters
   */
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    writeMessage("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    writeMessage(greeter.sayHello());
  }

  @SuppressWarnings("PMD.SystemPrintln")
  private static void writeMessage(String msg) {
    System.out.println(msg);
  }
}