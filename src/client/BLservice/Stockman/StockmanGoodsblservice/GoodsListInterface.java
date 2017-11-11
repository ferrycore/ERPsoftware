package client.BLservice.Stockman.StockmanGoodsblservice;
import java.util.List;
import client.Vo.*;
public interface GoodsListInterface {
    public String addGoods(goodsVO goods);
    public String deleteGoods(goodsVO goods);
    public String modifyGoods(goodsVO goods);
    public List findGoods(String keyword);
}
