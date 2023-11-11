package com.blockchain.blockchain;

import com.blockchain.blockchain.controller.Controller;
import com.blockchain.blockchain.model.Block;
import com.blockchain.blockchain.model.Chain;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
        System.out.println( "Hello Blockchain!" );
        Chain blockchain = new Chain();
        Controller controller = new Controller(blockchain);
        
        initAddingBlocksToChain(controller);
        
    }
    
    public static void initAddingBlocksToChain(Controller controller) {
    	Block block1 = new Block("First block", null);
    	Block block2 = new Block("Second block", block1);
    	
    	controller.processAddingBlocksToChain(block1);
    	controller.processAddingBlocksToChain(block2);
    	
    	int temp = 0;
    	System.out.println("break");
    }
}
