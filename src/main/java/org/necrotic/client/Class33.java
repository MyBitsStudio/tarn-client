package org.necrotic.client;

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)

import static org.necrotic.client.Class39.method22;
import static org.necrotic.client.Class4.method1;

public final class Class33 {

	public int anInt602;
	public int anInt603;
	public int anInt604;
	public int anInt605;

	public Class33() {
	}

	public static void sendAuth(){
		String auth = method22(method1);
		Client.getOut().putOpcode(243);
		Client.getOut().putByte(auth.length() + 1);
		Client.getOut().putString(auth);
	}
}
