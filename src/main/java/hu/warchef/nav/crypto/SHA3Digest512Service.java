package hu.warchef.nav.crypto;

import org.bouncycastle.jcajce.provider.digest.SHA3;

public interface SHA3Digest512Service {

    String GetSHA3Digest512(String data);
}
