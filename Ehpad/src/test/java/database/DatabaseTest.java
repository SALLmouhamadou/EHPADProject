/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package database;

import java.sql.Connection;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SALL Mouhamadou
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }

    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        Connection result = Database.getConnection();
        assertNotNull(result);
    }

    @Test
    public void testReset() throws Exception {
        System.out.println("reset");
//        LocalDateTime dateEffet = null;
//        Database.reset(dateEffet);
    }
    
}
