module es.jlarriba.jrmapi {
    requires org.apache.logging.log4j;
    requires java.net.http;
    requires com.google.gson;
    requires zip4j;
    requires java.dotenv;
//    requires net.lingala.zip4j;

    exports es.jlarriba.jrmapi;
    exports es.jlarriba.jrmapi.model;
    opens es.jlarriba.jrmapi.http to es.jlarriba.jrmapi;
}