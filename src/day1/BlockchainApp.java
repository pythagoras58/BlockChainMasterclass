package day1;

public class BlockchainApp {
    public static void main(String[] args) {
        Block genesisBlock = new Block("Hi I'm the first block", "0");
        System.out.println("Hash for block 1  --> " + genesisBlock.hash);

        Block secondBlock = new Block("Hi I'm the second block", genesisBlock.hash);
        System.out.println("Hash for block 2  --> " + secondBlock.hash);

        Block thirdBlock = new Block("Hi I'm the third block", secondBlock.hash);
        System.out.println("Hash for block 3  --> " + thirdBlock.hash);



    }
}
