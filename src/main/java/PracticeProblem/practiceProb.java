package PracticeProblem;

import javax.swing.text.html.Option;
import java.util.LinkedList;
import java.util.Optional;

public class practiceProb {


    //Add two numbers represented by linked lists
    public LinkedList<Integer> addLinkedList(LinkedList<Integer> s, LinkedList<Integer> p){



        return null;
    }


    public String check(String str){
        Optional<String> value= Optional.ofNullable(str);
        if(!str.isBlank() && value.get().equals("test")){
            return "yes";
        }
        return "NO";
    }
}
