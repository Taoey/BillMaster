

-- 创建bill_detail_ali

ALTER TABLE `bill_detail_ali`
ADD COLUMN bill_place VARCHAR(50) DEFAULT "" COMMENT '交易来源地'
ADD COLUMN bill_type SMALLINT(1) DEFAULT 0 COMMENT '交易类型 1-即时到账交易 2-支付宝担保交易'
ADD COLUMN trader VARCHAR(100) DEFAULT "" COMMENT '交易对方'
ADD COLUMN goods VARCHAR(100) DEFAULT '' COMMENT '商品名称'
ADD COLUMN pay_num BIGINT(20) DEFAULT 0 COMMENT '账单支出'


-- 支付宝账单查询
SELECT * 
FROM `bill_detail_ali`
WHERE `status`=1
  AND gmt_create>= AND gmt_create<=
  AND 
