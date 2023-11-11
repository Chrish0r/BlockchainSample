package com.blockchain.blockchain.util;

import com.blockchain.blockchain.model.Block;

// TODO check what dependency might be required based on former jit-project
public class HashUtils {
	
	public static String calculateHash(Block block) {
		return String.valueOf(System.currentTimeMillis() + 31);
	}
}
