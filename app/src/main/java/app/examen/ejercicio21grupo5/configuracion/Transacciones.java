package app.examen.ejercicio21grupo5.configuracion;

public class Transacciones {

    /*Nombre de la base de datos*/
    public static final String NameDatabase ="PM01DB";

    /* Tablas de la base de datos en SQLite*/

    public static final  String tablaPersonas= "video";

    /*Campos de la tabla personas de la base de datos en SQLite*/

    public static final String id="id";
    public static final String video="video";

    /*Transacciones DDl tabla Personas ""  = * + -*/

    public static final String createTablePersonas ="CREATE TABLE video (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "video BLOB)";

    public static final String DROPTablePersonas = "DROP TABLE EXISTS video";

}
