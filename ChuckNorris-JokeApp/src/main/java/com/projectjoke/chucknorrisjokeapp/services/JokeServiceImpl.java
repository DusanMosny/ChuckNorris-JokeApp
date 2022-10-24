package com.projectjoke.chucknorrisjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements
    JokeService {

  private final ChuckNorrisQuotes chucknorrisQuotes;

  public JokeServiceImpl() {
    this.chucknorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return chucknorrisQuotes.getRandomQuote();
  }
}
