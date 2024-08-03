{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.openjdk22  # Specify openjdk 22 to match your local environment
  ];
}