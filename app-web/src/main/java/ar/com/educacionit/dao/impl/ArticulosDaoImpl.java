package ar.com.educacionit.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.com.educacionit.dao.ArticuloDao;
import ar.com.educacionit.domain.Articulos;

public class ArticulosDaoImpl extends JdbcDaoBase<Articulos> implements ArticuloDao{

	public ArticulosDaoImpl() {
		super("Articulos");
	}

	@Override
	protected void save(PreparedStatement st, Articulos entity) throws SQLException {
		//insert into categorias(
		st.setString(1, entity.getTitulo());
		st.setString(2, entity.getCodigo());
		st.setDate(3, new java.sql.Date(entity.getFechaCreacion().getTime()));
		st.setDouble(4, entity.getPrecio());
		st.setLong(5, entity.getStock());
		st.setLong(6, entity.getMarcasId());
		st.setLong(7, entity.getCategoriasId());
	}

	@Override
	public String getSaveSQL() {
		return ("(titulo,codigo,fecha_creacion,precio,stock,marcas_id,categorias_id) VALUES(?,?,?,?,?,?,?)" );
	}

	@Override
	protected void update(PreparedStatement st, Articulos entity) throws SQLException {

		st.setString(1, entity.getTitulo());
		st.setDouble(2, entity.getPrecio());
		st.setLong(3, entity.getStock());
		st.setLong(4,  entity.getMarcasId());
		st.setLong(5, entity.getCategoriasId());
	}

	@Override
	public String getUpdateSQL() {
		return "titulo=?, precio=?,stock=?,marcas_id=?,categorias_id?";
	}

}