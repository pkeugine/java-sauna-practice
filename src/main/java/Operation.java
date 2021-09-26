public class Operation {

  public static void main(String []args) {

    Locker locker = new Locker();
    Player player = new Player();
    FirstPhaseOperation firstPhaseOperation = new FirstPhaseOperation();
    Error error = new Error();

    while (true) {
      int operationHandler = firstPhaseOperation.firstPhaseOperation(locker,player);
      if (operationHandler == 0 ) {
        break;
      }
      if (operationHandler == -1) {
        error.printErrorLockerNumberNotExist();
      }
    }

  }

}
