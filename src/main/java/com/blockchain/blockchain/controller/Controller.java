package com.blockchain.blockchain.controller;

import com.blockchain.blockchain.model.Block;
import com.blockchain.blockchain.model.Chain;

public class Controller {
	private final Chain blockchain;

	public Controller(Chain blockchain) {
		this.blockchain = blockchain;
	}

	public void processAddingBlocksToChain(Block block) {
		blockchain.addBlock(block);
	}

	public Chain getBlockchain() {
		return blockchain;
	}

}
