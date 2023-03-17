/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;

/**
 *
 * @author Administrator
 */
public interface SetInterface<T> {
    
    boolean add(T newElement);
    boolean remove(T anElement);
    boolean checkSubset(SetInterface anotherSet);
    void union(SetInterface anotherSet);
    SetInterface intersection(SetInterface anotherSet);
    boolean isEmpty();
}
