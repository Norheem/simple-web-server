import service.HttpServiceServiceImpl;

import static common.HttpServer.PORT;

public class Main {

    public static void main(String[] args) {


        HttpServiceServiceImpl service = new HttpServiceServiceImpl();

        service.start(PORT);
    }
}
