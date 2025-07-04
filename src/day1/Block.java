package day1;

import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timestamp;
    private long nonce;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        this.nonce = 0;
        this.hash = "";
    }
}
