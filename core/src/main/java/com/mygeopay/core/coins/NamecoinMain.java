package com.mygeopay.core.coins;

import com.mygeopay.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class NamecoinMain extends CoinType {
    private NamecoinMain() {
        id = "namecoin.main";

        addressHeader = 52;
        // Namecoin does not have p2sh addresses
        acceptableAddressCodes = new int[] { addressHeader};
        spendableCoinbaseDepth = 100;

        family = BitFamily.get();
        name = "NMC (β)";
        fullname ="Namecoin"; // TODO Change the Title to reflect fullname when accessing coin
        symbol = "NMC";
        uriScheme = "namecoin";
        bip44Index = 7;
        unitExponent = 8;
        feePerKb = value(500000);
        minNonDust = value(10000); // 0.0001 NMC mininput
        softDustLimit = value(1000000); // 0.01 NMC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static NamecoinMain instance = new NamecoinMain();
    public static synchronized NamecoinMain get() {
        return instance;
    }
}
