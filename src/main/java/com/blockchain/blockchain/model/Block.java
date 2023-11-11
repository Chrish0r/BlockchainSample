package com.blockchain.blockchain.model;

import com.blockchain.blockchain.util.HashUtils;

public class Block {
	
	private final long timestamp;
	private final String data;
	private final String prevHash;
	private boolean isFirst;
	
	public Block(final String data) {
		this.timestamp = System.currentTimeMillis();
		this.data = data;
		// since 1st block -> TODO consider to wrap prevHash-class-attribute as an
		// Optional
		this.prevHash = null;
		this.isFirst = true;
	}
	
	public Block(final String data, final Block prevBlock) {
		this.timestamp = System.currentTimeMillis();
		this.data = data;
		// TODO add real calculated hash
		this.prevHash = HashUtils.calculateHash(prevBlock);
		this.isFirst = false;
	}

	public boolean isFirst() {
		return isFirst;
	}

	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getData() {
		return data;
	}

	public String getPrevHash() {
		return prevHash;
	}
}
