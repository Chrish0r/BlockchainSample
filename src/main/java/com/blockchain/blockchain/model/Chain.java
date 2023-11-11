package com.blockchain.blockchain.model;

import java.util.List;
import java.util.ArrayList;

public class Chain {
	private final List<Block> blocks = new ArrayList<>();
	
	// default constructor
	public Chain() {
		
	}
	
	public void addBlock(Block block) {
		blocks.add(block);
	}
	
	public boolean isValid() {
		// TODO examine the entire chain
		return false;
	}

	public List<Block> getBlocks() {
		return blocks;
	}
}
