package com.epam.spb.homework.task1;

import com.epam.spb.lection2.*;
import java.util.*;

public class Selector {
    private static final String[] args = {"Lorem","Ipsum"};
    private static final LinkedList<String> menuHeader = new LinkedList<String>(){{
        add("1.ArgumentsExample");
        add("2.AutoPack");
        add("3.BigExample");
        add("4.BitOperations");
        add("5.Charstest");
        add("6.ClassExample");
        add("7.CoverClasses");
        add("8.DataTypes");
        add("9.Import");
        add("10.InstanceOf");
        add("11.LogicOperations");
        add("12.Main");
        add("13.Operators");
        add("14.StringTransformation");
        add("15.UnaryOperators");

    }};
    static boolean menuResult(String i){
        switch (i){
            case "1": ArgumentsExample.main(args);
                break;
            case "2": AutoPack.main(args);
                break;
            case "3": BigExample.main(args);
                break;
            case "4": BitOperations.main(args);
                break;
            case "5": CharsTest.main(args);
                break;
            case "6": ClassExample.main(args);
                break;
            case "7": CoverClasses.main(args);
                break;
            case "8": DataTypes.main(args);
                break;
            case "9": Import.main(args);
                break;
            case "10":InstanceOf.main(args);
                break;
            case "11":LogicOperations.main(args);
                break;
            case "12":Main.main(args);
                break;
            case "13":Operators.main(args);
                break;
            case "14":StringTransformation.main(args);
                break;
            case "15":UnaryOperators.main(args);
                break;

            case "exit": return false;
            default:
                System.out.println("Invalid number, try again");
                break;
        }
        return true;
    }
    static void printMenu(){
        ListIterator<String> li = menuHeader.listIterator();
        System.out.println("MAIN MENU");
        System.out.println("-----------------------");
        while(li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("-----------------------");
        System.out.print("Choose menu point or type <exit>:");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            printMenu();
            System.out.println("||||||||||||||||||");
            flag = menuResult(sc.nextLine());
            System.out.println("||||||||||||||||||");
        }
        System.out.println("App closed");
    }

}
