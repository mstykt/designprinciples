/**
 * Created by mesut on 30.07.2016.
 * <br />
 * This package is example of Dependency Inversion Principle
 * Previous version of {@link com.designprinciples.dependencyinversion.Client} class is depends Some concrete classes
 * This situation means all changes of concrete classes effect Client and after all changes client had to change also
 * Dependency inversion principle is change the situation and Client just depends on {@link com.designprinciples.dependencyinversion.Car} interface
 * Now {@link com.designprinciples.dependencyinversion.Client} doesnt has to know classes which implement {@link com.designprinciples.dependencyinversion.Car} interface.
 */
package com.designprinciples.dependencyinversion;