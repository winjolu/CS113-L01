{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.openjdk  # Specify openjdk to match your local environment
  ];
}
