package hu.warchef.nav.crypto;

import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.Hex;

public class SHA3Digest512ServiceImpl implements SHA3Digest512Service {

    @Override
    public String GetSHA3Digest512(String data) {
        SHA3.DigestSHA3 digest = new SHA3.Digest512();
        byte[] result = digest.digest(data.getBytes());
        return Hex.toHexString(result).toUpperCase();
    }
}
