package application;

import db.DB;
import model.entities.Department;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Department books = new Department(1, "Books");
        System.out.println(books);
    }
}