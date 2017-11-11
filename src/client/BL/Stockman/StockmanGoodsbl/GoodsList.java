package client.BL.Stockman.StockmanGoodsbl;

import client.Vo.goodsVO;

import java.util.List;

public class GoodsList implements GoodsController{

    @Override
    public String addGoods(goodsVO goods) {
        goodsList.add(new goodsVO());
        return null;
    }

    @Override
    public String deleteGoods(goodsVO goods) {
        return null;
    }

    @Override
    public String modifyGoods(goodsVO goods) {
        return null;
    }

    @Override
    public List findGoods(String keyword) {
        return null;
    }
}
