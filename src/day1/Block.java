package day1;

import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timestamp;
    private int nonce;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        this.nonce = 0;
        this.hash = calculateHash();
    }


    public String calculateHash(){
        // Combine all relevant data to create the hash
        String calculatedHash = StringUtil.applySha256(
                previousHash + Long.toString(timestamp)
                        + Integer.toString(nonce) + data
        );
        return calculatedHash;
    }

    public String getData() {
        return data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getNonce() {
        return nonce;
    }
}
