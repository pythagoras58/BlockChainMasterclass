package day3;

import com.google.gson.GsonBuilder;
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



        String blockChainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockChainJson);

    }

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;

        //loop through blockchain to check hashes:
        for(int i = 0; i < blockchain.size(); i++){
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);

        }

        return true;
    }
}
