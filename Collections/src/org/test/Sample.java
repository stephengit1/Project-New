package org.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample
{
public static void main(String[] args)
{
List<Object> l=new ArrayList<Object>();

l.add(10);
l.add("Sam");
l.add(20);
l.add(true);
l.add(30);
l.add("ram");
l.add('d');
l.add("Zeo");
 System.out.println(l);

 //To get the size of the list
 int size = l.size();
 System.out.println(size);

//To get the value based on the index
 Object object = l.get(2);
System.out.println(object);

//To add the value in the specific index
l.add(1, 20);
System.out.println(l);

//To remove the from the particular index
Object remove = l.remove(3);
System.out.println(remove);
System.out.println(l);

//To replace the value
Object set = l.set(3, 50);
System.out.println(set);
System.out.println(l);

//To get the index position of the particular value (First Occurance)
int io = l.indexOf(10);
System.out.println(io);

//To get the index position of the particular value (Last Occurance)
int lo = l.lastIndexOf(30);
System.out.println(lo);

//To check whether the value in inside the last or not
boolean contains = l.contains("sam");
System.out.println(contains);

System.out.println("==============================");

for (int i = 0; i < l.size(); i++) {
	Object O2 = l.get(i);
System.out.println(O2);
}

System.out.println("===============================");
for (Object x : l) {
	System.out.println(x);
}

List<Integer>li=new LinkedList<>();
li.add(70);
li.add(80);
li.add(90);
System.out.println(li);

//To add all the values
l.addAll(li);
System.out.println(l);
li.add(10);
li.add(40);
System.out.println(li);

//To remove the common values 
//l.removeAll(li);
//System.out.println(l);

//To retain the common values
l.retainAll(li);
System.out.println(l);
}
}