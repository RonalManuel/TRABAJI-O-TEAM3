package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IVoucherDao;
import pe.edu.upc.entity.Voucher;
import pe.edu.upc.serviceinterface.IVoucherService;

@Named
@RequestScoped
public class VoucherServiceImpl implements IVoucherService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IVoucherDao vD;

	@Override
	public void insert(Voucher v) {
		vD.insert(v);
	}

	@Override
	public List<Voucher> list() {
		// TODO Auto-generated method stub
		return vD.list();
	}

}