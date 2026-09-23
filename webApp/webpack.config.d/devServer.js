console.log("CONFIG WEBPACK CHARGÉE");

//let config;
config.devServer = {
    ...config.devServer,
    historyApiFallback: {
        disableDotRule: true,
        rewrites: [
            {
                from: /./,
                to: "/404.html"
            }
        ]
    }
};