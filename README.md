com.knewin.data.client
======================

API cliente em Java para efetuar consultas nos web services da [Knewin](http://knewin.com "Knewin Inteligência em Recuperação Informação").
  
  
  
  
Exemplo de como fazer consulta na API de notícias
-------------------------------------------------

		final NewsDataRequestInfo requestInfo = new NewsDataRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);

		final NewsDataRequest newsDataRequest = new NewsDataRequest();
		final DataResponseInfo<NewsDataInfo> responseInfo = newsDataRequest
			.getNews(requestInfo, "http://data.knewin.com/news");

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Títulos das notícias recuperadas");
		responseInfo.getHits().forEach(newsDataInfo -> System.out.println("   - " + newsDataInfo.getTitle()));
  
  
  
  
  
Exemplo de como fazer consulta na API de vídeos
-----------------------------------------------

		final String url = "http://data.knewin.com/video?k=" + key + "&q=" + query;

		final VideoDataRequest videoDataRequest = new VideoDataRequest();
		final DataResponseInfo<VideoDataInfo> responseInfo = videoDataRequest.getVideos(url);

		System.out.println("Número de vídeos encontrados: " + responseInfo.getNumDocs());

		System.out.println("Títulos dos vídeos recuperados");
		responseInfo.getHits().forEach(videoDataInfo -> System.out.println("   - " + videoDataInfo.getTitle()));

  
  
  


