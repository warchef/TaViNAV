package hu.warchef.nav.crypto;

import org.bouncycastle.jcajce.provider.digest.SHA512;
import org.bouncycastle.util.encoders.Hex;

public class SHADigest512ServiceImpl implements SHADigest512Service{
    @Override
    public String GetSHADigest512(String data) {
        SHA512.Digest digest = new SHA512.Digest();
        byte[] result = digest.digest(data.getBytes());
        return Hex.toHexString(result).toUpperCase();
    }
}
