import java.util.ArrayList;
import java.util.List;

// DAO.java
public class DAO {
    private List<X> listaX;

    public DAO() {
        this.listaX = new ArrayList<>();
    }

    public List<X> listar() {
        return listaX;
    }

    public void inserir(X x) {
        listaX.add(x);
    }

    public void excluir(int id) {
        listaX.removeIf(x -> x.getId() == id);
    }

    public void atualizar(X x) {
        for (int i = 0; i < listaX.size(); i++) {
            if (listaX.get(i).getId() == x.getId()) {
                listaX.set(i, x);
                break;
            }
        }
    }
}
