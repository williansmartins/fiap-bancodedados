import junit.framework.Assert;

import com.williansmartins.dao.PedidoDAOJDBC;
import com.williansmartins.model.Pedido;

public class MMain {
	public static void main(String[] args) {
		Pedido pedidoMockado = new Pedido(null, "willians", "pao", "suco");
		Integer id_mockado = new PedidoDAOJDBC().save(pedidoMockado);
		Pedido pedidoBuscado = new PedidoDAOJDBC().findById(id_mockado);
		
		Assert.assertEquals(id_mockado, pedidoBuscado.getId());
		Assert.assertEquals(pedidoBuscado.getNome(), pedidoMockado.getNome());
	}
}
