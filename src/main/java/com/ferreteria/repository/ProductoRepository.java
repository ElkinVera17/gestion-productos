package com.ferreteria.repository;

import com.ferreteria.model.Producto;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ProductoRepository {

    private MongoCollection<Document> collection;

    public ProductoRepository() {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = client.getDatabase("ferreteria_db");
        this.collection = database.getCollection("productos");
    }

    public void guardarProducto(Producto producto) {
    	Document doc = new Document("nombre", producto.getNombre())
                .append("precio", producto.getPrecio())
                .append("stock", producto.getStock());

        collection.insertOne(doc);
    }

    public long contarProductos() {
        return collection.countDocuments();
    }
}
