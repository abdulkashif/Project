package javaAdvance.Day2.Ass19_Package_AccessSpecifiers;
public class Base {
int variable1;
private int variable2;
protected int variable3;
public int variable4;
/*
* Default Constructor that initializes the member variables
*/
public Base () {
variable1=100;
variable2=200;
variable3=300;
variable4=400;
}
/*
* Returns the value of the member variable variable1
*/
int getVariable1(){
return variable1;
}
/*
* Returns the value of the member variable variable2
*/
public int getVariable2(){
return variable2;
}}