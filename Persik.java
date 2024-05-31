package UAP;

public class Persik extends Tanaman implements Perawatan {
    public Persik() {
        super(180, 250, 15);
    }

    @Override
    public void berkembang() {
        if (getLamaHidup() < getMasaHidup()) {
            setLamaHidup(getLamaHidup() + 1);
            setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
            if (getProsesBerbuah() >= getBerbuah()) {
                setBuah(getBuah() + 1);
                setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            }
        }
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 2.5);
    }

    @Override
    public String toString() {
        return "Persik - " + super.toString();
    }
}
