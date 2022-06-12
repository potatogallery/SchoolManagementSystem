/*
 * Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * IRepository.java
 * Due Date 18 June 2022 23:59
 *
 */
package za.ac.cput.school_management.repository;

public interface IRepository <T, ID>{
    T create (T t);
    T read (ID id);
    T update (T t);
    void delete(ID id);



}
