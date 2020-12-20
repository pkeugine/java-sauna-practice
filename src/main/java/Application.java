public class Application {

    public static void main(String[] args) {

        Sauna sauna = new Sauna();

        do {
            sauna.run();
        } while (Sauna.IS_OPEN);
    }
}
