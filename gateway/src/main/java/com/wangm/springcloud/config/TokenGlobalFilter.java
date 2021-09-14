package com.wangm.springcloud.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author wangm
 * @since 2021/9/7
 */
@Component
public class TokenGlobalFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //如何获取参数
        String token = exchange.getRequest().getQueryParams().getFirst("token");
//        if (token == null || token.isEmpty()) {
//            ServerHttpResponse response = exchange.getResponse();
//            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
//            String msg = "token is null";
//            DataBuffer buffer = response.bufferFactory().wrap(msg.getBytes());
//            return response.writeWith(Mono.just(buffer));
//        }
        //直接转发真实服务
        return chain.filter(exchange);
    }
}
