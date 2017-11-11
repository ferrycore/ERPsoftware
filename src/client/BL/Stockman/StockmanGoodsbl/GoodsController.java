package client.BL.Stockman.StockmanGoodsbl;

import client.BLservice.Stockman.StockmanGoodsblservice.GoodsListInterface;
import client.Vo.goodsVO;

import java.util.ArrayList;

public interface GoodsController extends GoodsListInterface {
    ArrayList<goodsVO> goodsList= new ArrayList<>();
}