/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import Ejercicio1.*;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public abstract class Animal { //abstrat evita la implementacion
    public abstract String hacerSonido();
    //return "El animal hace un sonido"; //-----implementacion de un metodo
    }
/*En resumen, usa abstract cuando quieras crear una base común para un grupo 
de clases relacionadas, pero no quieras permitir que esa base sea instanciada directamente. 
Es una herramienta poderosa para estructurar y organizar tu código de manera lógica y reutilizable.
tambien cuando no sabemos que implementacion usar*/