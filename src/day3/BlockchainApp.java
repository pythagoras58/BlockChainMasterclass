package day3;

import day1.Block;

import java.util.ArrayList;

public class BlockchainApp {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficultyLevel = 5;

    public static void main(String[] args) {
        blockchain.clear();
        blockchain.add(new Block("Hi I'm the first block", "0"));
        blockchain.add(new Block("Yo I'm the second block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("Hey I'm the third block", blockchain.get(blockchain.size()-1).hash));


        System.out.println("First block: " + blockchain.get(blockchain.size()-1).hash);
        System.out.println("Second block: " + blockchain.get(blockchain.size()-1).hash);
        System.out.println("Third block: " + blockchain.get(blockchain.size()-1).hash);



    }
}
