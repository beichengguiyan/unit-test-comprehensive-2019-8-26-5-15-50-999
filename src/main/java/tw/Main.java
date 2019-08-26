package tw;

import java.util.ArrayList;
import java.util.List;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
    	
    	List<String> answer=new ArrayList<String>();
    	answer.add("1");
    	answer.add("2");
    	answer.add("3");
    	answer.add("4");
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            System.out.println(input);
        }
        System.out.println("游戏结束");
    }
}
